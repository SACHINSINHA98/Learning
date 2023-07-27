import ExpenseComponent from "./ExpenseComponent";
import './ExpensesList.css'
const ExpenseList = (props) => {
  if(props.filteredList.length===0){
    return <h2 className="expenses-list__fallback"> No Expenses Found</h2>
  }
  return (
    <ul className="expenses-list">
      {props.filteredList.map((expenses) => (
        <ExpenseComponent
          key={expenses.id}
          title={expenses.title}
          amount={expenses.amount}
          date={expenses.date}
        />
      ))}
    </ul>
  );
};

export default ExpenseList;
