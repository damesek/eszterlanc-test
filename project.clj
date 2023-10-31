(defproject eszterlanc-test "0.2.0"
  :description "Eszterlanc teszt repository"
  :url "https://github.com/damesek/eszterlanc-test"
  :license {:name "EPL 2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [hu.baader/eszterlanc "0.3.3"]
                 [mta.szte.rgai/magyarlanc "0.3.0"]]
  :repl-options {:init-ns eszterlanc-test.core})


