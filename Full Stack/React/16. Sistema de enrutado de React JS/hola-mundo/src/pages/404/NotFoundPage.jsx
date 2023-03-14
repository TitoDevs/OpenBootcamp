import React from 'react';
import { useNavigate } from 'react-router-dom';

const NotFoundPage = () => {

    const history = useNavigate();

    const navigateTo = (path) => {
        history(path)
    }

    return (
        <div>
            <h1>404 - Not Found</h1>
            <button onClick={() => navigateTo('/')}>
                Go Back to Home
            </button>
        </div>
    );
}

export default NotFoundPage;
