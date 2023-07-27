import { useState } from "react";
import Expense from "./Components/Expenses/Expense";
import NewExpense from "./Components/NewExpense/NewExpense";
import Chart from "./Components/Chart/Chart";
const DUMMY_EXPENSES = [
  {
    id: "e1",
    title: "Toilet Paper",
    amount: 94.12,
    date: new Date(2020, 7, 14),
  },
  { id: "e2", title: "New TV", amount: 799.49, date: new Date(2021, 2, 12) },
  {
    id: "e3",
    title: "Car Insurance",
    amount: 294.67,
    date: new Date(2021, 2, 28),
  },
  {
    id: "e4",
    title: "New Desk (Wooden)",
    amount: 450,
    date: new Date(2021, 5, 12),
  },
];

const App = () => {
  const [addedExpense, setAddExpense] = useState(DUMMY_EXPENSES);
  // behind the scenes
  // React.createElement(
  //   'div',{},
  //   React.createElement('h2',{},"Lets get started"),
  //   React.createElement(Expenses,{expenses:expenses})

  // );
  const addExpenseHandler = (expense) => {
    setAddExpense((prevExpense) => {
      return [expense, ...prevExpense];
    });
    //setAddExpense([expense,...addedExpense])
  };
  return (
    <div>
      <h2>Let's get started!</h2>

      <div>
        <NewExpense onAddExpense={addExpenseHandler}></NewExpense>
      </div>

      <div>
        <Expense expenses={addedExpense}></Expense>
      </div>
    </div>
  );
};

export default App;
