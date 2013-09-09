lein-bower
==========

Clojure Leiningen Plugin for bower web lib dependency management

## Usage

Put `[org.clojars.wokier/lein-bower "0.1.0"]` into the `:plugins` vector of your project.clj.

### Single task call

$ lein bower

### Build Pre-task call

Add :prep-tasks ["javac" "compile" "bower"]` to your project.clj.

