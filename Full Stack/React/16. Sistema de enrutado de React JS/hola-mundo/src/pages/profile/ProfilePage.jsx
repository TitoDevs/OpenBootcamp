import React from 'react';
import { useNavigate } from 'react-router-dom';

const ProfilePage = ({user}) => {

    const history = useNavigate();

    const navigateTo = (path) => {
        history(path)
    }

    const goBack = () => {
        history(-1);
    }
    return (
        <div>
            <h1>Your Profile</h1>
            <button onClick={() => navigateTo('/tasks')}>Tasks</button>
            <button onClick={goBack}>
                Go Back
            </button>
        </div>
    );
}

export default ProfilePage;
