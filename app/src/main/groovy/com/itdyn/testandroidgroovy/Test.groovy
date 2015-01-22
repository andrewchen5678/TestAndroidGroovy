package com.itdyn.testandroidgroovy

import groovy.transform.CompileStatic
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString;

@CompileStatic
@ToString(includeNames = true)
@EqualsAndHashCode
class Test implements Serializable{
    Long id
    Long speakerId

    String title
    String summary
    List<String> tags
}