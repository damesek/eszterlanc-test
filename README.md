### Using via Clojars (maven)

The Magyarlanc model files are large, so I've uploaded them to an S3 bucket.

# initialize

## auto

Run the initialize shell script. This will download and unzip the entire folder for you.

## manually

Please download the file from the following link: https://eszterlanc.s3.amazonaws.com/magyarlanc-3_0.zip.
Unzip it in the root directory, and it will be placed in the src/java folder for you.

In project.clj, please add the Java source path.


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
