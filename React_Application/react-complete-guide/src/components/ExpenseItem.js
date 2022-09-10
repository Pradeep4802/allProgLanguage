import React, { useState } from "react";
import "./ExpenseItem.css";
import ExpenseDate from "./ExpenseDate";
import Card from "./Card";

const ExpenseItem = (props) => {
  // function clickHandler() {}
  const [title, setTitle] = useState(props.title);
  console.log('ExpensItem evaluated by React');

  // let title = props.title;

  const clickHandler = () => {
    setTitle('Updated!');
    // title = "Updated!";
    console.log(title);
  };

  return (
    <Card className="expense-item">
      {/* <div>{props.date.toISOString()}</div> */}
      <ExpenseDate date={props.date} />
      <div className="expense-item__description">
        <h2>{title}</h2>
        <div className="expense-item__price">${props.amount}</div>
      </div>
      <button onClick={clickHandler}>Change Title</button>
    </Card>
  );
};

export default ExpenseItem;
