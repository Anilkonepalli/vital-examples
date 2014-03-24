package ai.vital.twentynewsClassificationApp

import ai.vital.predict.PredictModel
import ai.vital.vitalsigns.VitalSigns;

import org.example.twentynews.*


class TwentyNewsClassificationApp {

	static main(args) {
	
		
		// Input properties
		
		String subject = "Let's play softball in the park!"
		
		String body = "Softball game tonight.  Bring your bats!"
		
		// Model Jar Path
		 
		String modelJarPath = "..."
		
		
		// Initialize Predict Model
		PredictModel model = new PredictModel()
		
		model.loadJar(new File(modelJarPath))
		
		// Do prediction
		// predict.predict(mydoc)

		// Create instance of TwentyNewsDocument
		
		TwentyNewsDocument mydoc = new TwentyNewsDocument()
		
		mydoc.URI = "http://example.org/twentynews/TwentyNewsDocument/123"
		mydoc.title = subject
		mydoc.body = body

		
				
		model.predict(mydoc)
		
		
		// Display categories with scores in edges
		List<Category> categories = mydoc.getNewsCategories()
		
		for( int i = 0 ; i < categories.size(); i++ ) {
			println categories[i].name
		}
		
		
		
		
	}

}