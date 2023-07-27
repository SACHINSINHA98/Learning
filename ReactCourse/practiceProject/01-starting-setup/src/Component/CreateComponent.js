const CreateComponent=(props)=>{
    return (<div style={{color:"red"}}>
        <div>
            <h2>{props.user.name}</h2>
        </div>
        <div>
        <h2>{props.user.age}</h2>
        </div>
        
    </div>)
}
export default CreateComponent;