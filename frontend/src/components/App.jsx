import React, { useState } from "react";

import FindProductsService from "../services/find-products-service";

import Home from "./model/Product";
import Header from "./layout/Header";

const App = () => {
  const [products, setProducts] = useState([]);

  const [categoryCode, setCategoryCode] = useState("");

  const handleInput = (e) => {
    setCategoryCode(e.target.value);
  };

  const handleSearch = () => {
    FindProductsService.getProducts(categoryCode).then((response) => {
      setProducts(response.data);
    });
  };

  return (
    <div>
      <Header />

      <div className="container mt-3">
        <section className="antialiased bg-gray-100 text-gray-600 h-screen px-4">
          <div className="hidden sm:block sm:ml-6 ">
            <div className="flex space-x-4 content-center">
              <input
                type="text"
                className="bg-gray-900 text-white px-3 py-2 rounded-md text-sm font-medium"
                placeholder="Product Category"
                name="Product Category"
                value={categoryCode}
                onChange={handleInput}
              />
              <button
                type="submit"
                className="group relative flex justify-center py-2 px-4 border border-transparent text-sm font-medium rounded-md text-white bg-indigo-600 hover:bg-indigo-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-indigo-500"
                onClick={handleSearch}
              >
                {" "}
                Search
              </button>
            </div>
          </div>
          <header className="px-5 py-4 border-b border-gray-100">
            <h2 className="font-semibold text-gray-800">Products</h2>
          </header>
          <div className="p-3">
            <div className="overflow-x-auto">
              <table className="table-auto w-full">
                <thead className="text-xs font-semibold uppercase text-gray-400 bg-gray-50">
                  <tr>
                    <th className="p-2 whitespace-nowrap">
                      <div className="font-semibold text-left">
                        Product Code
                      </div>
                    </th>
                    <th className="p-2 whitespace-nowrap">
                      <div className="font-semibold text-left">
                        Product Description
                      </div>
                    </th>
                    <th className="p-2 whitespace-nowrap">
                      <div className="font-semibold text-left">
                        Product Price
                      </div>
                    </th>
                  </tr>
                </thead>
                <tbody className="text-sm divide-y divide-gray-100">
                  {products.map((product) => (
                    <Home
                      productCode={product.productCode}
                      productDescription={product.productDescription}
                      productPrice={product.productPrice}
                    />
                  ))}
                </tbody>
              </table>
            </div>
          </div>
        </section>
      </div>
    </div>
  );
};

export default App;
