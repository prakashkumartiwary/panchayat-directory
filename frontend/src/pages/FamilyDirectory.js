
import React,{useEffect,useState} from 'react';
import axios from 'axios';

export default function FamilyDirectory(){

 const [members,setMembers]=useState([]);

 useEffect(()=>{
  axios.get("http://localhost:8080/api/members/family/1")
  .then(res=>setMembers(res.data))
 },[])

 return(
  <div>
   <h2>Family Members</h2>

   {members.map(m=>(
    <div key={m.id} style={{border:'1px solid #ddd',padding:10,margin:10}}>
     <h3>{m.name}</h3>
     <p>{m.relation}</p>
    </div>
   ))}

  </div>
 )
}
