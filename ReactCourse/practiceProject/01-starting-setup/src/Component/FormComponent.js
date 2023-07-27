import React,{useState} from "react"

const FormComponent=(props)=>{
    const[enteredName, setEnteredName]=useState('')
    const[enteredAge, setEnteredAge]=useState('')
    const onChangeNameHandler=(event)=>{
        setEnteredName(event.target.value)
        console.log(event.target.value)
    }
    const onChangeAgeHandler=(event)=>{
        setEnteredAge(event.target.value)
        console.log(event.target.value)
    }
    const onSubmitHandler=(event)=>{
        
        event.preventDefault()
        if(enteredName.trim().length===0 || enteredAge.trim().length===0 ){
            props.showError("invalid Input")
            return
        }else if(enteredAge <= 0){
            props.showError("age error")
            return
        }
        const User={
            name: enteredName,
            age: enteredAge,
            key: Math.random().toString(),
        }
        props.showError("no error")
        props.onAdd(User)
        //console.log(User)
        setEnteredName('')
        setEnteredAge('')
        
    }
    return (<div>
        <form onSubmit={onSubmitHandler}>
            <div>
            <label style={{color:'red'}}>Username</label>
            <input type="text" placeholder="Username" value={enteredName} onChange={onChangeNameHandler}/>
            </div>
            <div>
            <label style={{color:'red'}}  >Age</label>
            <input type="number" placeholder="Enter Age" value={enteredAge} onChange={onChangeAgeHandler}/>
            </div>
            <div>
            
            <button type="submit" style={{color:'red'}} >Add User</button>
            </div>
            
        </form>


    </div>)
}
export default FormComponent