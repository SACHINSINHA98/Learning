import React, { useState } from "react";
//import ExpenseComponent from "./ExpenseComponent";
import Card from "../UI/Card";
import "./Expense.css";
import ExpensesFilter from "../ExpenseFilter/ExpenseFilter";
import ExpenseList from "./ExpensesList";
import ExpensesChart from "./ExpensesChart";

const Expense = (props) => {
  const [fiteredYear, setFilteredYear] = useState("2020");
  const filterChangeHandler = (selectedYear) => {
    setFilteredYear(selectedYear);
  };
  const filteredList = props.expenses.filter((expense) => {
    return expense.date.getFullYear().toString() === fiteredYear;
  });
  // let message=<p> No elements found</p>
  // if(filteredList.length>0){
  //   message=filteredList.map((expenses) => (
  //     <ExpenseComponent
  //       key={expenses.id}
  //       title={expenses.title}
  //       amount={expenses.amount}
  //       date={expenses.date}
  //     />
  //   ))
  
   
  
  return (<li>
    <Card className="expenses">
      <div>
        <ExpensesFilter
          selected={fiteredYear}
          onChangeFilter={filterChangeHandler}
        ></ExpensesFilter>
      </div>
      <div>
      <ExpensesChart expenses={filteredList}/>
      </div>
      {/* {message} */}
       <ExpenseList filteredList={filteredList}/>
      {/* {
        //this is java script and
        (filteredList.length === 0 && <p>No Expenses Found</p>)
      }
    {(filteredList.length >0 && )} */}
    </Card>
    </li>);
  
};

export default Expense;
