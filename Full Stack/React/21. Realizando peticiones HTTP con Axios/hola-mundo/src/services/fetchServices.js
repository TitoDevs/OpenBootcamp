export const getAllUsers = async () => {
    
    let response = await fetch('http://reqres.in/api/users');
    console.log('Response:', response);
    console.log('Status code', response.status);
    console.log('OK', response.ok);

    // We return json
    return response.json();
}

export const getAllPagesUsers = async (page) => {
    
    let response = await fetch(`http://reqres.in/api/users?page=${page}`);
    console.log('Response:', response);
    console.log('Status code', response.status);
    console.log('OK', response.ok);

    // We return json
    return response.json();
}

export const getUsersDetails = async (id) => {
    let response = await fetch(`http://reqres.in/api/users/${id}`);
    console.log('Response:', response);
    console.log('Status code', response.status);
    console.log('OK', response.ok);

    // We return json
    return response.json();
}

export const login = async (email, password) => {
    let body = {
        email: email,
        password: password
    }

    let response = await fetch('https://reqres.in/api/login', {
        method: 'POST',
        // mode: 'no-cors',
        // credentials: 'omit',
        // cache: 'no-cache',
        // headers: {
        //     'Content-type': 'application/json'
        // },
        body: JSON.stringify(body),
    })
    console.log('Response:', response);
    console.log('Status code', response.status);
    console.log('OK', response.ok);
    return response.json();
}