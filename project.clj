(defproject contemporary-words "0.2.0"
  :description "Picks n contemporary words at random"
  :url "https://github.com/chrisoei/clj-contemporary-words"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repl-options {:init-ns contemporary-words.core}
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
