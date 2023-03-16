import React, { useState, useEffect} from 'react';
import { getRandomUser } from '../../services/axiosServices';

const AxiosExample = () => {

    const [user, setUser] = useState(null);

    // useEffect(() => {
    //     obtainUser();
    // }, []);

    const obtainUser = () => {
        getRandomUser()
            .then((response) => {
                if(response.status === 200) {
                    setUser(response.data.results[0]);
                }
            })
            .catch((error) => {
                alert(`Something went wrong: ${error}`);
            })
    }

    return (
        <div>
            <h1>Axios Example</h1>
            <h2>
                {
                    user !== null ?
                    (
                        <div>
                            <img alt='avatar' src={user.picture.large}></img>
                            <h2>{user.name.title} {user.name.first} {user.last}</h2>
                            <h3>{user.email}</h3>
                        </div>
                    )
                    :
                    (
                        null
                    )
                }
                <div>
                    <p>Generate a new User</p>
                    <button onClick={obtainUser}>
                        Random User
                    </button>
                </div>
            </h2>
        </div>
    );
}

export default AxiosExample;
