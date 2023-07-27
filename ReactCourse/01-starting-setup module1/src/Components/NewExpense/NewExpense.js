import React ,{useState}from 'react';//this by default imported in every file in modern react though we can also add it manually.
//out jsx use tis import for its work.
import './NewExpense.css'
import ExpenseForm from './ExpenseForm'
const NewExpense=(props)=>{
   const[isEditing,setIsEditing]= useState(false)
    const saveExpenseDataHandler=(enteredExpenseData)=>{
        const expenseData= {
            ...enteredExpenseData,
            id: Math.random().toString()
           
        }
        props.onAddExpense(expenseData)
        setIsEditing(false)
    }
    const startEditingHandler=()=>{
        setIsEditing(true)
    }
    const stopEditingHandler=()=>{
        setIsEditing(false)
    }
    
    return <div className='new-expense'>
        {!isEditing && <button onClick={startEditingHandler}>Add New Expense</button>}
     {isEditing && <ExpenseForm onSaveExpenseData={saveExpenseDataHandler} onCancel={stopEditingHandler}></ExpenseForm>}
    </div>
}
export default NewExpense