(ns assemble.views.welcome
  (:require [assemble.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]
        [hiccup.core]))

(defpage "/" []
  (common/layout 
    [:div {:class "title"} "assemble"]
    [:div {:class "subtitle"} "your workplace, evolved"]
    [:div {:class "mission-statement"} 
      [:p "We believe that thoughtfully designed & serviced workplaces enhance productivity, inspire worker satisfaction and
           ultimately contribute to exceptional business performance. It is with this focus that we provide professional work 
           environments for a curated community of likeminded members and do so with pricing that allows us to thrive together."]
      [:p "We invite our members to let us know if we deviate from our path, knowing that shared success is a team effort."]
    ]
    ))
