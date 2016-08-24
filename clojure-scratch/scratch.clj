(ns user
  (:import [java.net URL URLClassLoader]))

;; What's my classpath?
(->> (ClassLoader/getSystemClassLoader)
     (.getURLs)
     (map #(.getFile %)))
