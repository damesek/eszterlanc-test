# Setup 

The Magyarlanc model files are large, so I've uploaded them to an S3 bucket.

## initialize

On 2023-11-06, I updated the initialization script.

The script installs the MTA-SZTA Magyarlanc JAR file to the local Maven repository.
Please execute the initialization shell script to complete this process.

`./initialize`

You will find the JAR file located within the lib directory.
Add to project `mta.szta.rgai/magyarlanc` and `hu.baader/eszterlanc`.

```clojure 
(defproject eszterlanc-test "0.1.0-SNAPSHOT"
            :description "FIXME: write description"
            :url "http://example.com/FIXME"
            :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
                      :url "https://www.eclipse.org/legal/epl-2.0/"}
            :dependencies [[org.clojure/clojure "1.11.1"]
                           [hu.baader/eszterlanc "0.3.3"]
                           [mta.szte.rgai/magyarlanc "0.3.0"]]
            :repl-options {:init-ns eszterlanc-test.core})
```


## Run tests

```clojure
(ns eszterlanc-test.core
  (:require [eszterlanc.core :as c]
            [eszterlanc.gui :as GUI]))


(defn init
  "that was easier than I planned.."
  []
  (GUI/init))


(init)

(c/object->clj
  (c/sentence-array "Kezdetben Isten teremtette baglyokat"))

```