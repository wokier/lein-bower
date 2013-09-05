(ns leiningen.bower
  (:require [clojure.java.shell :as sh]))

(defn bower
  "npm install bower  bower install"
  [project & args]
  (let [sys (sh/sh "/usr/local/bin/npm" "install" "bower")]
    (println (:out sys))
    (binding [*out* *err*]
      (println (:err sys)))
    )
  (let [sys (sh/sh "./node_modules/bower/bin/bower" "install")]
    (println (:out sys))
    (binding [*out* *err*]
      (println (:err sys)))
    )
  )
