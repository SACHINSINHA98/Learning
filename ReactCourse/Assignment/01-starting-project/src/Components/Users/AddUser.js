import React, { useState,useRef } from "react";
import Card from "../UI/Card";
import classes from "./AddUser.module.css";
import Button from "../UI/Button";
import ErrorModal from "../UI/ErrorModal";
const AddUser = (props) => {
  const nameInputRef=useRef()
  const ageInputRef=useRef()
  // const [enteredUsername, setEnteredUsername] = useState("");
  // const [enteredAge, setEnteredAge] = useState("");
  const [error, setError] = useState();

  // const changeUsernameHandler = (event) => {
  //   // console.log(event.target.value)
  //   // setEnteredUsername(event.target.value);
    
  // };
  // const changeAgeHandler = (event) => {
  //   // setEnteredAge(event.target.value);
    
  // };
 
  const addUserHandler = (event) => {
    event.preventDefault();
    const enteredUsername=nameInputRef.current.value
    const enteredAge=ageInputRef.current.value

    if (enteredUsername.trim().length === 0 || enteredAge.trim().length === 0) {
      setError({
        title: "INVALID INPUT",
        message: "NO DATA ENTERED",
      });
      return;
    } else if (+enteredAge < 1) {
      setError({
        title: "AGE ERROR",
        message: "ENTER VALUE ABOVE 1",
      });
      return;
    }
    props.onAddUser(enteredUsername, enteredAge);
    // setEnteredAge("");
    // setEnteredUsername("");
    nameInputRef.current.value=''
    ageInputRef.current.value=''
  };
  const errorHandler = () => {
    setError(null);
  };
  let errorModule = error;
  if (error) {
    errorModule = (
      <ErrorModal
        title={error.title}
        message={error.message}
        onConfirm={errorHandler}
      ></ErrorModal>
    );
  }
  return (
    <div>
      {errorModule}
      {/* {error && <ErrorModal title={error.title} message={error.message}></ErrorModal>}
       */}
      <Card className={classes.input}>
        <form onSubmit={addUserHandler}>
          <label htmlFor="username"> Username</label>
          <input
            id="username"
            type="text"
            // value={enteredUsername}
            // onChange={changeUsernameHandler}
            ref={nameInputRef}
          ></input>

          <label htmlFor="age"> Age</label>
          <input
            id="age"
            type="number"
            // value={enteredAge}
            // onChange={changeAgeHandler}
            ref={ageInputRef}
          ></input>

          <Button type="submit">
            <div>Add User</div>
          </Button>
        </form>
      </Card>
    </div>
  );
};
export default AddUser;
