import React,{useState} from 'react';
import AddUser from './Components/Users/AddUser';
import UsersList from './Components/Users/UsersList';

function App() {
 
  const[usersList,setUsersList]=useState([])
  const addUserHandler=(userName,userAge)=>{
    setUsersList((prevUsersList)=>[...prevUsersList,{name:userName,age:userAge, id:Math.random().toString() }])
}
const deleteHandler=(id)=>{
const updatedList=usersList.filter(user=>user.id !== id) 
setUsersList(updatedList)
}
  return (
    <React.Fragment>
      <AddUser onAddUser={addUserHandler}></AddUser>
      <UsersList users={usersList} deleteOnClick={deleteHandler} ></UsersList>
    </React.Fragment>
  );
}

export default App;
