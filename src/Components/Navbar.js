import React from 'react'
import { useNavigate } from 'react-router-dom';

const Navbar = () => {
  const navigate = useNavigate();
  const redirect=()=>{
      navigate("/addEmployee");
  }
    return (
        <div className="bg-gray-800">
          <div className='h-16 px-8 flex items-center'>
            <button className='text-white font-bold' onClick={redirect}>Employee Management</button>
          </div>
        </div>
      );
}

export default Navbar