import {HttpClient, json} from 'aurelia-fetch-client'

export class foodAdd {

  	addFood() {
		let client = new HttpClient();
 		let foodData = {}
    document.getElementById("foodform").reset(); 
		client.fetch('http://localhost:8080/foods/add', {
      'method': 'POST',
      'body': json(this.foodData)
    })
			.then(response => response.json())
			.then(data => {
				console.log('Server saatis ' + data.foodName + data.foodNum + data.foodType + data.foodDate);
			});
		}}
