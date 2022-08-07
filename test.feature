Feature:  Functionality check

  Scenario Outline: Verify the ‘Distance’
    When website is open "<url>"
    And pressed the button "<btnName>"
    And in the field "<arg0>" entered "<arg1>"
    And in the field <arg01> they entered <arg11>
    And selected in the field <arg02> transport options <arg12>
    And pressed the button "<btnName1>"
    Then the distance is <url1>
    Examples:
      | url                                                | btnName | arg0       | arg1           | arg01      | arg11      | arg02             | arg12            | btnName1 | url1                                                                                                                         |
      | https://www.openstreetmap.org/#map=5/51.097/15.271 | btn     | route_from | Радищева, Київ | "route_to" | "Кембридж" | "routing_engines" | "Bicycle (OSRM)" | commit   | "https://www.openstreetmap.org/directions?engine=fossgis_osrm_bike&route=50.448%2C30.411%3B52.198%2C0.139#map=4/51.07/15.25" |