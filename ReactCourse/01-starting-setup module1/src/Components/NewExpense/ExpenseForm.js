import React,{useState} from "react";
import "./ExpenseForm.css";
const ExpenseForm = (props) => {
   const [enteredTitle,setTitle]= useState('');
   const [enteredAmount,setAmount]= useState('');
   const [enteredDate,setDate]= useState('');

//alternative for multiple states
// const [enteredInput,setInput]=useState({
//     title:'',
//     amount:'',
//     date:'',
// })
  const changeTitleHandler = (event) => {
    setTitle(event.target.value)
    // setInput({
    //     ...enteredInput,
    //     title: event.target.value
    // });
    //alternative to above approach
    //to get the previous state we should pass a fucnction to our set function and react will exceute it to get
    //previous state below example shows it
   // setInput((prevState)=>{
     //   return {
      //      ...prevState,
        //    title: event.target.value
        //}

    //})
    //console.log(event.target.value);
  };
  const changeAmountHandler = (event) => {
    setAmount(event.target.value)
    // setInput({
    //     ...enteredInput,
    //     amount: event.target.value
    // });
    //console.log(event.target.value);
  };
  const changeDateHandler = (event) => {
    setDate(event.target.value)
    // setInput({
    //     ...enteredInput,
    //     date: event.target.value
    // });
    //console.log(event.target.value);
  };
  const submitHandler=(event)=>{
    event.preventDefault();
        const expenseData= {
            
                title: enteredTitle,
                amount:  +enteredAmount,
                date: new Date(enteredDate)
            }
            props.onSaveExpenseData(expenseData)
            setTitle('')
            setAmount('')
            setDate('')
    //console.log(expenseData)    
  }
  return (
    
    <form onSubmit={submitHandler}>
      <div className="new-expense__controls">
        <div className="new-expense__control">
          <label>Name</label>
          <input type="text" value={enteredTitle} onChange={changeTitleHandler} />
        </div>
        <div className="new-expense__control" onChange={changeAmountHandler}>
          <label>Amount</label>
          <input type="number" value={enteredAmount} min="0.01" step="0.01" />
        </div>
        <div className="new-expense__control" onChange={changeDateHandler}>
          <label>Date</label>
          <input type="date" value={enteredDate} min="2019-01-01" max="2022-12-31" />
        </div>
      </div>
      <div className="new-expense__actions">
        <button type="button" onClick={props.onCancel}>Cancel</button>
        <button type="submit">Add Expense</button>
        
      </div>
    </form>
  );
};

export default ExpenseForm;
