lein-bower
==========

Clojure Leiningen Plugin for bower web lib dependency management.

Based on http://bower.io/ and https://npmjs.org/

## Usage

Put `[org.clojars.wokier/lein-bower "0.3.0"]` into the `:plugins` vector of your project.clj.

### Single task call

$ lein bower

### Build Pre-task call

Add :prep-tasks ["javac" "compile" "bower"]` to your project.clj.


## Example

https://github.com/wokier/toclojure
