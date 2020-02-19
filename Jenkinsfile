properties([
    parameters([
	stringParam(
            defaultValue: '', 
            description: 'TAG', 
            name: 'tag')
    ])
])


node('sbt') {
 
    stage 'Checkout'
        checkout scm

    stage 'Docker nginx image'
        sh "sbt compile"
    
    stage 'Docker nginx image'
        sh "sbt run"
        
        
}