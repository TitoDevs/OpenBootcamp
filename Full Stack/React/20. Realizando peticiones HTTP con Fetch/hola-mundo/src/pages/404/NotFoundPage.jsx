import React from 'react';
import { useHistory } from 'react-router-dom';

const NotFoundPage = () => {

    const history = useHistory();

    const navigateTo = (path) => {
        history.push(path)
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
