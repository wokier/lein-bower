(ns leiningen.bower
  (:require [clojure.java.shell :as sh]))

(defn bower
  "npm install bower  bower install"
  [project & args]

  (println "Bower...")
  (try
    (let [sys (sh/sh "test" "-x" "./node_modules/bower/bin/bower")]
      (println (:out sys))
      (binding [*out* *err*]
        (println (:err sys)))
      (if (not= 0 (:exit sys))
        (let [sys (sh/sh "/usr/local/bin/npm" "install" "bower")]
          (println (:out sys))
          (binding [*out* *err*]
            (println (:err sys)))
          )
        )
      )
    (let [sys (sh/sh "./node_modules/bower/bin/bower" "--version")]
      (println (:out sys))
      (binding [*out* *err*]
        (println (:err sys)))
      )
    (let [sys (sh/sh "./node_modules/bower/bin/bower" "install")]
      (println (:out sys))
      (binding [*out* *err*]
        (println (:err sys)))
      )
    (println "Bower OK")
    (catch Exception e (binding [*out* *err*] (println (str "Caught exception: " (.getMessage e)))))
    )
  )
