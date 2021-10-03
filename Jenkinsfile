pipeline {	 
	agent any	 
    	stages {     	 
    	stage("Compile") {          	 
            	steps {               	 
                	sh "javac RandomNumbers.java"          	 
            	}     	 
        	}     	 
    	stage("test") {          	 
        	steps {               	 
                	sh "java RandomNumbers"          	 
            	}     	 
        	}	 
    	}
}

