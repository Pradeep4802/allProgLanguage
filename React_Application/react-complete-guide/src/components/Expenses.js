import "./expenses.css";
import ExpenseItem from "./ExpenseItem";
// import ExpenseDate from "./ExpenseDate";

function Expenses(props) {
  return (
    <div className="expenses">
      <ExpenseItem
        title={props.items[0].title}
        amount={props.items[0].amount}
        date={props.items[0].date}
      />
      <ExpenseItem
        title={props.items[1].title}
        amount={props.items[1].amount}
        date={props.items[1].date}
      />
      <ExpenseItem
        title={props.items[2].title}
        amount={props.items[2].amount}
        date={props.items[2].date}
      />
      <ExpenseItem
        title={props.items[3].title}
        amount={props.items[3].amount}
        date={props.items[3].date}
      />
    </div>
  );
}

export default Expenses;




// function ExpensList(props) {
//     return (
//       <div className="expenses">
//         {props.expenses.map((e) => {
//           return <ExpenseItem title={e.title} amount={e.amount} date={e.date} />;
//         })}
//       </div>
//     );
//   }
  
