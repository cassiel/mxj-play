(import '[java.net URL URLClassLoader])
(import '[java.lang ClassLoader])

(let [cl (ClassLoader/getSystemClassLoader)
      urls (.getURLs cl)]
  (doseq [url urls]
    (println (.getFile url))))
