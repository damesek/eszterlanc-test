### Using via Clojars (maven)

!! That is important, because the file is too large. I can't upload to Clojars.

Do you need to download from https://drive.google.com/file/d/1AUcEjCgVqAVXPTqEzXAuSXgx10GDyxYx/view?usp=sharing 
the magyarlanc-3.0.zip file.
Do you need to unzip to "src/java" folder and add to project.clj the source. Example:

```clojure 
(defproject eszterlanc-test "0.1.0-SNAPSHOT"
            :description "FIXME: write description"
            :url "http://example.com/FIXME"
            :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
                      :url "https://www.eclipse.org/legal/epl-2.0/"}
            :dependencies [[org.clojure/clojure "1.11.1"]
                           [org.clojars.baader/eszterlanc "0.3.0"]]
            :java-source-paths ["src/java"]
            :repl-options {:init-ns eszterlanc-test.core})
```
Test repository: https://github.com/damesek/eszterlanc-test
