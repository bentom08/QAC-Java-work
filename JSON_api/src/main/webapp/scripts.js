function httpGet(myurl) {
		var xmlHttp = new XMLHttpRequest();
		xmlHttp.open("GET", myurl, false);
		xmlHttp.send(null);

		document.getElementById("Output").innerHTML = xmlHttp.response;
}

function getGetVal() {
		return document.getElementById("get").value;
}

function httpGetSingle() {
		var xmlHttp = new XMLHttpRequest();
		xmlHttp.open("GET", "http://localhost:8080/api-0.0.1-SNAPSHOT/api/movie/getMovie/" + getGetVal(), false);
		xmlHttp.send(null);

		displayJSON(xmlHttp.response);
}

function getDeleteVal() {
		return document.getElementById("delete").value;
}

function httpDelete() {
		var xmlHttp = new XMLHttpRequest();
		xmlHttp.open("DELETE", "http://localhost:8080/api-0.0.1-SNAPSHOT/api/movie/deleteMovie/" + getDeleteVal(), false);
		xmlHttp.send(null);

		document.getElementById("Output").innerHTML = "id " + getDeleteVal() + " Deleted";
}

function getTitle() {
		return document.getElementById("title").value;
}

function getGenre() {
		return document.getElementById("genre").value;
}

function getRating() {
		return document.getElementById("rating").value;
}

function addMovie() {
		var xmlHttp = new XMLHttpRequest();
		xmlHttp.open("POST", "http://localhost:8080/api-0.0.1-SNAPSHOT/api/movie/addMovie", false);
		xmlHttp.setRequestHeader('Content-Type', 'application/json');
		xmlHttp.send(JSON.stringify({
			title: getTitle(),
			genre: getGenre(),
			ageRating: getRating()
		}));

		document.getElementById("Output").innerHTML = "Movie Added!";
}

function displayJSON(x) {
		var json = JSON.parse(x);

		document.getElementById("Output").innerHTML = "id: " + json.id + "\nTitle: " + json.title  + "\nGenre: " + json.genre + "\nAge Rating: " + json.ageRating;
}