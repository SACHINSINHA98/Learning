import CreateComponent from "./CreateComponent"

const ShowComponent=(props)=>{
   
 return (
    props.user.map(user=><CreateComponent  user={user} > 

        </CreateComponent>)
 )
    }
 export default ShowComponent ; 
    
 

