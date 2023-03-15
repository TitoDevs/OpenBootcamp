import React, { useState, useEffect} from 'react';
import { getRandomUser } from '../../services/axiosServices';
import { Button } from '@mui/material'

const AxiosExample = () => {

    const [joke, setJoke] = useState(null);
    const [likes, setLikes] = useState(0);
    const [dislikes, setDislikes] = useState(0);

    useEffect(() => {
       // obtainUser();
    }, []);

    const randomJoke = () => {
        getRandomUser()
            .then((response) => {
                // if(response.status === 200) {
                //     setJoke(response.data.results);
                // }
                setJoke(response.data);
                console.log(response)
            })
            .catch((error) => {
                alert(`Something went wrong: ${error}`);
            })
    }

    const numLikes = () => {
        setLikes(likes + 1);
        randomJoke();
    }

    const numDislikes = () => {
        setDislikes(dislikes + 1);
        randomJoke();
    }

    return (
        <div>
            <h1>Axios Example</h1>
            {
                joke != null ? (<h2>"{joke.value}</h2>) : (<p>Generate a new joke</p>)
            }
            <button onClick={randomJoke}>
                Random joke
            </button>
            <div style={{margin: '30px', display: 'flex', gap: '30px', justifyContent: 'center'}}>
                <Button onClick={numLikes} variant='contained' color='success'>LIKE</Button>
                <Button onClick={numDislikes} variant='contained' color='error'>DISLIKE</Button>
            </div>
            <div style={{display: 'flex', justifyContent: 'center', gap:'80px'}}>
                <div>
                    <h3>Likes</h3>
                    <h4>{likes}</h4>
                </div>
                <div>
                    <h3>Dislikes</h3>
                    <h4>{dislikes}</h4>
                </div>
                
            </div>
            
        </div>
    );
}

export default AxiosExample;
