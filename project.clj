(defproject AoC_2019 "0.1.0-SNAPSHOT"
  :description "Advent of Code 2019 solutions"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/tools.trace "0.7.10"]]

  :target-path "target/%s"
  :profiles {:dev {:dependencies [[com.billpiel/sayid "0.0.18"]
                                  [proto-repl "0.3.1"]
                                  [proto-repl-sayid "0.1.3"]]}})
