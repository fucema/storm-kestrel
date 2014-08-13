(defproject storm/storm-kestrel "0.7.2-batchsize"
  :source-path "src/clj"
  :java-source-paths ["src/jvm"]
  :javac-options {:debug "true"}
  :dependencies [[org.apache.storm/storm-core "0.9.1-incubating"]]
  :dev-dependencies [[org.clojure/clojure "1.2.0"]
                     [org.clojure/clojure-contrib "1.2.0"]]
  :jvm-opts ["-Djava.library.path=/usr/local/lib:/opt/local/lib:/usr/lib"])
