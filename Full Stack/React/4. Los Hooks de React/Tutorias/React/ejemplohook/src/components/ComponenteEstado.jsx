import React, {useState, useEffect} from "react";

export const ComponenteEstado = () => {
    
    const [partida, setPartida] = useState(
        {
            usuario: 'Tito',
            puntos: 0
        }
    );

    useEffect(() => {
        console.log("Actualización de puntos")
        // saludar();
    }, [partida]);

    const saludar = () => {
        console.log("Hola mundo");
    }
    
    const sumarPartida = () => {
        setPartida(
            {
                usuario: "TitoDev",
                puntos: partida.puntos + 1
            }
        )
    }

    return (
        <div>
            <h1>Hola, {partida.usuario}</h1>
            <h2>
                Puntuación: {partida.puntos}
            </h2>
            <button onClick={sumarPartida}>
                Sumar puntos
            </button>
        </div>
    )
}