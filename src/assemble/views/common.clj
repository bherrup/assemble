(ns assemble.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page :only [include-css html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "assemble"]
               (include-css "/css/reset.css")
               (include-css "/css/assemble.css")]
              [:body
               [:div#wrapper
                content]]))
