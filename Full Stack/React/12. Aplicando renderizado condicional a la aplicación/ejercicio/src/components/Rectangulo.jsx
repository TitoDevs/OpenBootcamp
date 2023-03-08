import React, { useState } from 'react';

const Rectangulo = () => {
    const [color, setColor] = useState('black');
    const [intervalId, setIntervalId] = useState(null);

    const getStyle = {
        width: '255px',
        height: '255px',
        backgroundColor: color,
    }   

    const changeColor = () => {
        const red = Math.floor(Math.random() * 256);
        const green = Math.floor(Math.random() * 256);
        const blue = Math.floor(Math.random() * 256);
        setColor(`rgb(${red}, ${green}, ${blue})`);
    };

    const onMouseEnter = () => {
        if (!intervalId) {
            const id = setInterval(changeColor, 1000);
            setIntervalId(id);
        }
    };

    const onMouseLeave = () => {
        if (intervalId) {
            clearInterval(intervalId);
            setIntervalId(null);
            setColor('black');
        }
    };

    const onDoubleClick = () => {
        if (intervalId) {
            clearInterval(intervalId);
            setIntervalId(null);
            setColor(color);
        }
    };

    return (
        <div 
            style={getStyle} 
            onMouseEnter={onMouseEnter}
            onMouseLeave={onMouseLeave}
            onDoubleClick={onDoubleClick}>
        </div>
    );
}

export default Rectangulo;
