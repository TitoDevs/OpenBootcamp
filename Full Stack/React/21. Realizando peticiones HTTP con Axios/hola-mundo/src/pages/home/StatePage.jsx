import React from 'react';
import { useLocation } from 'react-router-dom'

const StatePage = () => {

    const location = useLocation();

    return (
        <div>
            <h1>State: {location.state.online ? 'Online' : 'Offline'}</h1>ç
            <h1>Query Params: {location.search ? 'Online' : 'Offline'}</h1>
        </div>
    );
}

export default StatePage;
