### Using via Clojars (maven)

The Magyarlanc model files are large, so I've uploaded them to an S3 bucket.

# initialize

2023-11+06 I updated the initialize script

We install to local Maven repository the MTA-SZTA Magyarlanc Jar file.
Run the initialize shell script. 

You can find the jar file in the lib folder.
Add to project `mta.szta.rgai/magyarlanc` and `org.clojars.baader/eszterlanc`.

```clojure 
(defproject eszterlanc-test "0.1.0-SNAPSHOT"
            :description "FIXME: write description"
            :url "http://example.com/FIXME"
            :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
                      :url "https://www.eclipse.org/legal/epl-2.0/"}
            :dependencies [[org.clojure/clojure "1.11.1"]
                           [org.clojars.baader/eszterlanc "0.3.0"]
                           [mta.szte.rgai/magyarlanc "0.3.0"]]
            :repl-options {:init-ns eszterlanc-test.core})
```
