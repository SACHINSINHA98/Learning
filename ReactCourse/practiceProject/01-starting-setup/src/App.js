import React,{useState} from "react";
import FormComponent from "./Component/FormComponent";
import ShowComponent from "./Component/ShowComponent";
import ErrorComponent from "./Component/ErrorComponent";
const DummyUser=[{
  name:"sachin",
  age:20,
  id:1,
  }]
function App() {
  const[addedUser,setAddedUser]=useState(DummyUser)
  const[defaultMessage,setErrorMessage]=useState("")

 const addUserHandler=(user)=>{
    setAddedUser((prevState)=>[...prevState,user])
  }
  let errormessage=<div>
  <ErrorComponent errorMessage={defaultMessage}></ErrorComponent>
  </div>
  const showErrorHandler=(error)=>{
    setErrorMessage(error)
  }
  if(defaultMessage.trim().length>0){
    errormessage=<div>
        <ErrorComponent errorMessage={defaultMessage}></ErrorComponent>
         </div>
  }
 
  return (
    <div>
      <div>
      <FormComponent  onAdd={addUserHandler} showError={showErrorHandler}></FormComponent>
      </div>
      <div>
        <ShowComponent user={addedUser}></ShowComponent>
      </div>
      <div>
        {errormessage}
      </div>
    </div>
  );
}

export default App;
