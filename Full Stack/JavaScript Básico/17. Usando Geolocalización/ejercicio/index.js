function initMap() {
    const posicion = {
        lat: -25.363,
        lng: 131.004
    }

    const map = new google.maps.Map(document.getElementById("map"), {
        zoom: 4,
        center: posicion
    })

    const marker = new google.maps.Marker({
        position: posicion,
        map,
    })

    const marker1 = new google.maps.Marker({
        position: posicion,
        map,
    })

    const marker2 = new google.maps.Marker({
        position: posicion,
        map,
    })

    const lugar_1 = {
        lat: 36.53422130855616,
        lng: -6.298624091691192
    }
    marker.setPosition(lugar_1)

    const lugar_2 = {
        lat: 37.1729163319516,
        lng: -3.5956213432360373
    }
    marker1.setPosition(lugar_2)

    const lugar_3 = {
        lat: 35.84929010017753,
        lng: 137.94890040509154
    }
    marker2.setPosition(lugar_3)
}