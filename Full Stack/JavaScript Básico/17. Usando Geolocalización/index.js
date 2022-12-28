let marker, map

function initMap() {
    const posicion = {
        lat: -25.363,
        lng: 131.004
    }

    map = new google.maps.Map(document.getElementById("map"), {
        zoom: 4,
        center: posicion
    })

    marker = new google.maps.Marker({
        position: posicion,
        map,
        title: "Posición inicial"
    })

    // Obtener la geolocalización
    // marker.setPosition({lat, lng})
    geoposicion()
}

function geoposicion() {
    if(navigator.geolocation) {
        const geoLoc = navigator.geolocation
        const options = {timeout: 60000}
        const watchPor = geoLoc.watchPosition(centraMapa, onError, options)
    } else {
        alert("Tu navegador no admite geolocalización.")
    }
}

function centraMapa(position){
    const nuevaPos = {
        lat: position.coords.latitude,
        lng: position.coords.longitude
    }
    console.log(nuevaPos)
    marker.setPosition(nuevaPos)
    map.setCenter(nuevaPos)
}

function onError(error) {
    console.log("Se ha producido un error y lo hemos gestionado")
    console.error(error)
}