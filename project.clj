(defproject contemporary-words "0.1.0"
  :description "Picks n contemporary words at random"
  :url "https://github.com/chrisoei/clj-contemporary-words"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot contemporary-words.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
