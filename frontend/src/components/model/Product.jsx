import React from "react";

const Product = (props) => {
  return (
    <tr>
      <td className="p-2 whitespace-nowrap">
        <div className="flex items-center">
          <div className="w-10 h-10 flex-shrink-0 mr-2 sm:mr-3"></div>
          <div className="font-medium text-gray-800">{props.productCode}</div>
        </div>
      </td>
      <td className="p-2 whitespace-nowrap">
        <div className="text-left">{props.productDescription}</div>
      </td>
      <td className="p-2 whitespace-nowrap">
        <div className="text-left font-medium text-green-500">
          $ {props.productPrice}
        </div>
      </td>
    </tr>
  );
};

export default Product;
