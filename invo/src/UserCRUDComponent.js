import React, { useState } from 'react';
import axios from 'axios';
import './UserCRUDComponent.css';
const UserCRUDComponent = () => {
  const [name, setName] = useState('');
  const [startupName, setStartupName] = useState('');
  const [startupIdea, setStartupIdea] = useState('');
  const [users,setUsers]=useState([])
  const HandleSubmit=(e)=>{
    e.preventDefault()
    console.log("ji")
    const users1={name,startupName,startupIdea}
    axios
      .post(`http://localhost:8080/api/Startup/add`, users1)
      .then((response) => {
        console.log(response.data);
      })
      .catch((error) => {
        console.error(error);
      });
  };
  const deleteUser = (id) => {
    const updatedUsers = users.filter((user) => user.id !== id);
    setUsers(updatedUsers);
  };

  return (
    <div className="mt-4">
      <h1>STATE YOUR INNOVATION</h1>
      <div className="mb-4">
        <form onSubmit={HandleSubmit}>
        <input
          type="text"
          className="form-control"
          placeholder="Name"
          value={name}
          onChange={(e) => setName(e.target.value)}
        />
        <input
          type="text"
          className="form-control mt-2"
          placeholder="Startup Name"
          value={startupName}
          onChange={(e) => setStartupName(e.target.value)}
        />
        <input
          type="text"
          className="form-control mt-2"
          placeholder="Startup Idea"
          value={startupIdea}
          onChange={(e) => setStartupIdea(e.target.value)}
        />
        <button type='submit' className="btn btn-primary mt-2" >
          Add User
        </button>
        </form>
      </div>
      <ul className="list-group">
        {users.map((user) => (
          <li key={user.id} className="list-group-item">
            <span className="mr-2"><strong>Name:</strong> {user.name}</span>
            <span className="mr-2"><strong>Startup Name:</strong> {user.startupName}</span>
            <span className="mr-2"><strong>Startup Idea:</strong> {user.startupIdea}</span>
            <button className="btn btn-danger" onClick={() => deleteUser(user.id)}>
              Delete
            </button>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default UserCRUDComponent;
