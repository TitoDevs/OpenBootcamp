import React, { useState, useEffect } from 'react';
import { getAllPagesUsers, getAllUsers, getUsersDetails } from '../../services/fetchServices';

const FetchExample = () => {

    const [users, setUsers] = useState([]);
    const [selectedUser, setSelectedUser] = useState({});
    const [pages, setPages] = useState(2);
    const [totalUsers, setTotalUsers] = useState(12);
    const [usersPerPage, setUsersPerPage] = useState(6);

    useEffect(() => {
        obtainUsers();
    }, []);

    const obtainUsers = () => {
        getAllUsers()
            .then((response) => {
                console.log('All Users: ', response.data);
                setUsers(response.data)
                setPages(response.total_pages);
                setTotalUsers(response.total)
                setUsersPerPage(response.per_page)
            })
            .catch((error) => {
                alert(`Error while retreiving your users:  ${error}`);
            })
            .finally(() => {
                console.log('Ended obtaining users');
                console.table(users);
            });
    }

    const obtainPagedUsers = (page) => {
        getAllPagesUsers(page)
            .then((response) => {
                console.log('All Paged Users: ', response.data);
                setUsers(response.data)
                setPages(response.total_pages);
                setTotalUsers(response.total)
                setUsersPerPage(response.per_page)
            })
            .catch((error) => {
                alert(`Error while retreiving your users:  ${error}`);
            })
            .finally(() => {
                console.log('Ended obtaining users');
                console.table(users);
            });
    }

    const obtainUserDetails = (id) => {
        getUsersDetails(id)
            .then((response) => {
                console.log('All Paged Users: ', response.data);
                setSelectedUser(response.data);
            })
            .catch((error) => {
                alert(`Error while retreiving your user:  ${error}`);
                setSelectedUser({});
            })
            .finally(() => {
                console.log('Ended obtaining user');
                console.table(selectedUser);
            });
    }

    return (
        <div>
            <h2>
                Users:
            </h2>

            { users.map((user, index) => 
                (
                    <p style={{cursor: 'pointer'}} key={index} onClick={() =>{ obtainUserDetails(user.id) } }>
                        {user.first_name} {user.last_name}
                    </p>
                )
            )}
            
            <p>Showing {usersPerPage} users of {totalUsers} in total</p>
            <button onClick={() => obtainPagedUsers(1)}>
                1
            </button>
            <button onClick={() => obtainPagedUsers(2)}>
                2
            </button>

            <div>
                <h3>User Details</h3>
                { selectedUser && (
                    <div>
                        <p>Name: {selectedUser.first_name}</p>
                        <p>Last Name: {selectedUser.last_name}</p>
                        <p>Email: {selectedUser.email}</p>
                        <img alt='avatar' src={selectedUser.avatar} style={{height: '50px', width:'50px'}}></img>
                    </div>
                )}
            </div>
        </div>
    );
}

export default FetchExample;
