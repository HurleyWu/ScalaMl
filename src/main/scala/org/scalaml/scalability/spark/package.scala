/**
 * Copyright (c) 2013-2015  Patrick Nicolas - Scala for Machine Learning - All rights reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License") you may not use this file 
 * except in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software is distributed on an 
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * The source code in this file is provided by the author for the sole purpose of illustrating the 
 * concepts and algorithms presented in "Scala for Machine Learning". 
 * ISBN: 978-1-783355-874-2 Packt Publishing.
 * 
 * Version 0.99
 */
package org.scalaml.scalability

		/**
		 * This package object defines the classes used in K-means clustering using the Apache
		 * Spark framework and MLlib machine learning library:
		 * 
		 * - Conversion of data to Spark RDD '''RDDSource'''
		 * 
		 * - Typical configuration of a Spark MLlib application '''SparkKMeansConfig'''
		 * 
		 * - Wrapper for the K-Means clustering using Apache Spark '''SparkKMeans'''
		 * @see Scala for Machine Learning Chapter 12 ''Scalable frameworks'' / Apache Spark
		 */
package object spark { }
// ---------------------------------------  EOF -----------------------------------------