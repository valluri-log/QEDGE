apply plugin:'application'
mainClassName = 'HelloWorld'

run { standardInput = System.in }
sourceSets { main { java { srcDir './' } } }

repositories {
    jcenter()
}

dependencies {
    // add dependencies here as below
    implementation group: 'org.apache.commons', name: 'commons-lang3', version: '3.9'
}
